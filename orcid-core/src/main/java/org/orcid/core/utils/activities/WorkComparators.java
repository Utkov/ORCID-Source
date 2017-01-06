package org.orcid.core.utils.activities;

import java.util.Comparator;

import org.orcid.jaxb.model.common_rc4.Title;
import org.orcid.jaxb.model.record.summary_rc4.WorkGroup;
import org.orcid.jaxb.model.record.summary_rc4.WorkSummary;
import org.orcid.jaxb.model.record_rc4.WorkTitle;
import org.orcid.pojo.ajaxForm.PojoUtil;

/**
 * 
 * @author Will Simpson
 *
 */
public class WorkComparators {

    private static Comparator<WorkSummary> DISPLAY_INDEX = (w1, w2) -> {
        return w1.compareTo(w2);
    };

    private static Comparator<WorkSummary> REVERSE_CHRONOLOGICAL = (w1, w2) -> {
        String dateString1 = PojoUtil.createDateSortString(null, w1.getPublicationDate());
        String dateString2 = PojoUtil.createDateSortString(null, w2.getPublicationDate());
        return -dateString1.compareTo(dateString2);
    };

    private static Comparator<Title> TITLE = Comparator.nullsLast(Comparator.comparing(Title::getContent));

    private static Comparator<WorkTitle> WORK_TITLE = Comparator.nullsLast((t1, t2) -> {
        return TITLE.compare(t1.getTitle(), t2.getTitle());
    });

    private static Comparator<WorkSummary> WORK_SUMMARY_WORK_TITLE = Comparator.nullsLast((w1, w2) -> {
        return WORK_TITLE.compare(w1.getTitle(), w2.getTitle());
    });

    private static Comparator<WorkSummary> WORK_TYPE = Comparator.nullsLast(Comparator.comparing(WorkSummary::getType));

    public static Comparator<WorkSummary> ALL_EXCEPT_DISPLAY_INDEX = REVERSE_CHRONOLOGICAL.thenComparing(WORK_SUMMARY_WORK_TITLE).thenComparing(WORK_TYPE);

    public static Comparator<WorkSummary> ALL = DISPLAY_INDEX.thenComparing(ALL_EXCEPT_DISPLAY_INDEX);

    public static Comparator<WorkGroup> GROUP = (g1, g2) -> {
        WorkSummary w1 = (WorkSummary) g1.getActivities().iterator().next();
        WorkSummary w2 = (WorkSummary) g2.getActivities().iterator().next();
        return WorkComparators.ALL_EXCEPT_DISPLAY_INDEX.compare(w1, w2);
    };

}

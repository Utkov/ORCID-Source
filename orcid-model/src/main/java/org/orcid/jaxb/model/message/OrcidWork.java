/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.message;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-title" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}journal-title minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}short-description" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-citation" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-type" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}publication-date" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-external-identifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}url" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-contributors" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}work-source" minOccurs="0"/>
 *         &lt;element ref="{http://www.orcid.org/ns/orcid}language-code" minOccurs="0" maxOccurs="1"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}put-code"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}visibility"/>
 *       &lt;attGroup ref="{http://www.orcid.org/ns/orcid}anyType"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "putCode", "workTitle", "translatedTitle", "journalTitle", "shortDescription", "workCitation", "workType", "publicationDate", "workExternalIdentifiers", "url",
        "workContributors", "workSource", "languageCode" })
@XmlRootElement(name = "orcid-work")
public class OrcidWork implements VisibilityType, Serializable {

    private static final long serialVersionUID = 1L;
    @XmlElement(name = "work-title")
    protected WorkTitle workTitle;    
    @XmlElement(name = "journal-title")
    protected Title journalTitle;
    @XmlElement(name = "short-description")
    protected String shortDescription;
    @XmlElement(name = "work-citation")
    protected Citation workCitation;
    @XmlElement(name = "work-type")
    protected WorkType workType;
    @XmlElement(name = "publication-date")
    protected PublicationDate publicationDate;
    @XmlElement(name = "work-external-identifiers")
    protected WorkExternalIdentifiers workExternalIdentifiers;
    protected Url url;
    @XmlElement(name = "work-contributors")
    protected WorkContributors workContributors;
    @XmlElement(name = "language-code")
    protected String languageCode;
    @XmlElement(name = "work-source")
    protected WorkSource workSource;
    @XmlAttribute(name = "put-code")
    protected String putCode;
    @XmlAttribute
    protected Visibility visibility;

    /**
     * Gets the value of the putCode property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public String getPutCode() {
        return putCode;
    }

    /**
     * Sets the value of the putCode property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setPutCode(String value) {
        this.putCode = value;
    }

    /**
     * Gets the value of the workTitle property.
     * 
     * @return possible object is {@link WorkTitle }
     * 
     */
    public WorkTitle getWorkTitle() {
        return workTitle;
    }

    /**
     * Sets the value of the workTitle property.
     * 
     * @param value
     *            allowed object is {@link WorkTitle }
     * 
     */
    public void setWorkTitle(WorkTitle value) {
        this.workTitle = value;
    }

    /**
     * Gets the value of the translatedTitle property.
     * 
     * @return possible object is {@link translatedTitle }
     * 
     */
    public TranslatedTitle getTranslatedTitle() {
        return translatedTitle;
    }

    /**
     * Sets the value of the translatedTitle property.
     * 
     * @param value
     *            allowed object is {@link translatedTitle }
     * 
     */
    public void setTranslatedTitle(TranslatedTitle translatedTitle) {
        this.translatedTitle = translatedTitle;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets the value of the shortDescription property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setShortDescription(String value) {
        this.shortDescription = value;
    }

    /**
     * Gets the value of the workCitation property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Citation getWorkCitation() {
        return workCitation;
    }

    /**
     * Sets the value of the workCitation property.
     * 
     * @param value
     *            allowed object is {@link Object }
     * 
     */
    public void setWorkCitation(Citation value) {
        this.workCitation = value;
    }

    /**
     * Gets the value of the workType property.
     * 
     * @return possible object is {@link WorkType }
     * 
     */
    public WorkType getWorkType() {
        return workType;
    }

    /**
     * Sets the value of the workType property.
     * 
     * @param value
     *            allowed object is {@link WorkType }
     * 
     */
    public void setWorkType(WorkType value) {
        this.workType = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return possible object is {@link PublicationDate }
     * 
     */
    public PublicationDate getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *            allowed object is {@link PublicationDate }
     * 
     */
    public void setPublicationDate(PublicationDate value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the workExternalIdentifiers property.
     * 
     * @return possible object is {@link WorkExternalIdentifiers }
     * 
     */
    public WorkExternalIdentifiers getWorkExternalIdentifiers() {
        return workExternalIdentifiers;
    }

    /**
     * Sets the value of the workExternalIdentifiers property.
     * 
     * @param value
     *            allowed object is {@link WorkExternalIdentifiers }
     * 
     */
    public void setWorkExternalIdentifiers(WorkExternalIdentifiers value) {
        this.workExternalIdentifiers = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return possible object is {@link Url }
     * 
     */
    public Url getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *            allowed object is {@link Url }
     * 
     */
    public void setUrl(Url value) {
        this.url = value;
    }

    /**
     * Gets the value of the workContributors property.
     * 
     * @return possible object is {@link WorkContributors }
     * 
     */
    public WorkContributors getWorkContributors() {
        return workContributors;
    }

    /**
     * Sets the value of the workContributors property.
     * 
     * @param value
     *            allowed object is {@link WorkContributors }
     * 
     */
    public void setWorkContributors(WorkContributors value) {
        this.workContributors = value;
    }

    /**
     * Gets the value of the workSources property.
     * 
     * @return possible object is {@link WorkSource }
     * 
     */
    public WorkSource getWorkSource() {
        return workSource;
    }

    /**
     * Sets the value of the workSources property.
     * 
     * @param value
     *            allowed object is {@link WorkSource }
     * 
     */
    public void setWorkSource(WorkSource value) {
        this.workSource = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return possible object is {@link Visibility }
     * 
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *            allowed object is {@link Visibility }
     * 
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }
        
    /**
     * Gets the value of the journalTitle property.
     * 
     * @return possible object is {@link Title }
     * 
     */
    public Title getJournalTitle() {
        return journalTitle;
    }

    /**
     * Sets the value of the journalTitle property.
     * 
     * @param value
     *            allowed object is {@link Title }
     * 
     */
    public void setJournalTitle(Title value) {
        this.journalTitle = value;
    }
    
    /**
     * Gets the value of the languageCode property.
     * 
     * @return possible object is {@link Title }
     * 
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *            allowed object is {@link String }
     * 
     */
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }
    
    @Override
    public String toString() {
        return OrcidMessage.convertToString(this);
    }

    /**
     * Note that put-code is not part of hashcode. This is important for avoid
     * creation of duplication works.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((publicationDate == null) ? 0 : publicationDate.hashCode());
        result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((workCitation == null) ? 0 : workCitation.hashCode());
        result = prime * result + ((workContributors == null) ? 0 : workContributors.hashCode());
        result = prime * result + ((workExternalIdentifiers == null) ? 0 : workExternalIdentifiers.hashCode());
        result = prime * result + ((workSource == null) ? 0 : workSource.hashCode());
        result = prime * result + ((workTitle == null) ? 0 : workTitle.hashCode());
        result = prime * result + ((workType == null) ? 0 : workType.hashCode());
        result = prime * result + ((journalTitle == null) ? 0 : journalTitle.hashCode());
        result = prime * result + ((languageCode == null) ? 0 : languageCode.hashCode());
        return result;
    }

    /**
     * Note that put-code is not part of equality. This is important for avoid
     * creation of duplication works.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrcidWork other = (OrcidWork) obj;
        if (publicationDate == null) {
            if (other.publicationDate != null)
                return false;
        } else if (!publicationDate.equals(other.publicationDate))
            return false;
        if (shortDescription == null) {
            if (other.shortDescription != null)
                return false;
        } else if (!shortDescription.equals(other.shortDescription))
            return false;
        if (url == null) {
            if (other.url != null)
                return false;
        } else if (!url.equals(other.url))
            return false;
        if (visibility != other.visibility)
            return false;
        if (workCitation == null) {
            if (other.workCitation != null)
                return false;
        } else if (!workCitation.equals(other.workCitation))
            return false;
        if (workContributors == null) {
            if (other.workContributors != null)
                return false;
        } else if (!workContributors.equals(other.workContributors))
            return false;
        if (workExternalIdentifiers == null) {
            if (other.workExternalIdentifiers != null)
                return false;
        } else if (!workExternalIdentifiers.equals(other.workExternalIdentifiers))
            return false;
        if (workSource == null) {
            if (other.workSource != null)
                return false;
        } else if (!workSource.equals(other.workSource))
            return false;
        if (workTitle == null) {
            if (other.workTitle != null)
                return false;
        } else if (!workTitle.equals(other.workTitle))
            return false;
        if (workType != other.workType)
            return false;
        
        if(journalTitle == null){
            if(other.journalTitle !=null)
                return false;
        } else if(!journalTitle.equals(other.journalTitle))
            return false;
        
        if(languageCode == null){
            if(other.languageCode != null)
                return false;
        } else if(!languageCode.equals(other.languageCode))
            return false;
            
        return true;
    }

}

<#--

    =============================================================================

    ORCID (R) Open Source
    http://orcid.org

    Copyright (c) 2012-2013 ORCID, Inc.
    Licensed under an MIT-Style License (MIT)
    http://orcid.org/open-source-license

    This copyright and license information (including a link to the full license)
    shall be included in its entirety in all copies or substantial portion of
    the software.

    =============================================================================

-->
<#-- @ftlvariable name="statistics" type="java.util.Map" -->
<@public >
<#escape x as x?html>
<div id="statistics" class="row">
    <div class="span3"></div>
    <div class="span9">
    	<span class="page-header"><@orcid.msg 'statistics.header'/>
    	</span>
    	<hr>
	
		<span class="stat-name"><@orcid.msg 'statistics.statistics_generation_date_label'/>&nbsp;<#if (statistics_date)??>${statistics_date}<#else>NA</#if></span>
		<hr>
		
        <span class="stat-name"><@orcid.msg 'statistics.live_ids'/></span>
		<div class="pull-right">
	        <#if statistics['liveIds']??>${statistics['liveIds']}<#else>Calculating</#if>
	    </div>
  		<hr>        
        
        <span class="stat-name"><@orcid.msg 'statistics.ids_with_verified_emails'/></span>
  		<div class="pull-right">
	        <#if statistics['idsWithVerifiedEmail']??>${statistics['idsWithVerifiedEmail']}<#else>Calculating</#if>
		</div>  		
  		<hr>
  		        
		<span class="stat-name"><@orcid.msg 'statistics.ids_with_works'/></span>
  		<div class="pull-right">
	        <#if statistics['idsWithWorks']??>${statistics['idsWithWorks']}<#else>Calculating</#if>
		</div>
  		<hr>
		
		<span class="stat-name"><@orcid.msg 'statistics.number_of_works'/></span>
  		<div class="pull-right">
	        <#if statistics['works']??>${statistics['works']}<#else>Calculating</#if>
		</div>
  		<hr>

		<span class="stat-name"><@orcid.msg 'statistics.number_of_works_with_dois'/></span>
  		<div class="pull-right">
	        <#if statistics['worksWithDois']??>${statistics['worksWithDois']}<#else>Calculating</#if>
		</div>
  		<hr>
    </div>
</div>
</#escape>
</@public>
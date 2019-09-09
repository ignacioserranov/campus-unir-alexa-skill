package es.ignacio.serranov.campusUnir.entity;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Props {

    private String sectionsExternallyMaintained;
    private String unirExtraIni;
    private String unirQEnd;
    private String unirAcademicYearId;
    private String unirExamEnd;
    private String unirAcademicYear;
    private String unirEdition;
    private String sectionsStudentRegistrationAllowed;
    private String unirQIni;
    private String contentRepository;
    private String unirStudyTemplateId;
    private String internalPeriodId;
    private String originalSiteId;
    private String internalStudyId;
    private String unirEditionIni;
    private String sectionsStudentSwitchingAllowed;
    private String unirEditionEnd;
    private String withExtraCall;
    private String internalSubjectId;
    private String unirZeroEnd;
    private String unirDegree;
    private String unirExamIni;
    private String unirSubjectCode;
    private String unirSubjectType;
    private String showSurveys;
    private String unirSubjectIni;
    private String unirtvSubjectId;
    private String unirIdplantilla;
    private String autoDateCalcLaunched;
    private String unirSubjectEnd;
    private String unirCreditNumber;
    private String unirSubjectGroups;
    private String unirSubjectCourse;
    @JsonProperty("unir-subject")
    private String unirSubject;
    private String sakaiParentId;
    private String contactName;
    private String contactEmail;

    public String getSectionsExternallyMaintained() {
        return sectionsExternallyMaintained;
    }

    public void setSectionsExternallyMaintained(String sectionsExternallyMaintained) {
        this.sectionsExternallyMaintained = sectionsExternallyMaintained;
    }

    public String getUnirExtraIni() {
        return unirExtraIni;
    }

    public void setUnirExtraIni(String unirExtraIni) {
        this.unirExtraIni = unirExtraIni;
    }

    public String getUnirQEnd() {
        return unirQEnd;
    }

    public void setUnirQEnd(String unirQEnd) {
        this.unirQEnd = unirQEnd;
    }

    public String getUnirAcademicYearId() {
        return unirAcademicYearId;
    }

    public void setUnirAcademicYearId(String unirAcademicYearId) {
        this.unirAcademicYearId = unirAcademicYearId;
    }

    public String getUnirExamEnd() {
        return unirExamEnd;
    }

    public void setUnirExamEnd(String unirExamEnd) {
        this.unirExamEnd = unirExamEnd;
    }

    public String getUnirAcademicYear() {
        return unirAcademicYear;
    }

    public void setUnirAcademicYear(String unirAcademicYear) {
        this.unirAcademicYear = unirAcademicYear;
    }

    public String getUnirEdition() {
        return unirEdition;
    }

    public void setUnirEdition(String unirEdition) {
        this.unirEdition = unirEdition;
    }

    public String getSectionsStudentRegistrationAllowed() {
        return sectionsStudentRegistrationAllowed;
    }

    public void setSectionsStudentRegistrationAllowed(String sectionsStudentRegistrationAllowed) {
        this.sectionsStudentRegistrationAllowed = sectionsStudentRegistrationAllowed;
    }

    public String getUnirQIni() {
        return unirQIni;
    }

    public void setUnirQIni(String unirQIni) {
        this.unirQIni = unirQIni;
    }

    public String getContentRepository() {
        return contentRepository;
    }

    public void setContentRepository(String contentRepository) {
        this.contentRepository = contentRepository;
    }

    public String getUnirStudyTemplateId() {
        return unirStudyTemplateId;
    }

    public void setUnirStudyTemplateId(String unirStudyTemplateId) {
        this.unirStudyTemplateId = unirStudyTemplateId;
    }

    public String getInternalPeriodId() {
        return internalPeriodId;
    }

    public void setInternalPeriodId(String internalPeriodId) {
        this.internalPeriodId = internalPeriodId;
    }

    public String getOriginalSiteId() {
        return originalSiteId;
    }

    public void setOriginalSiteId(String originalSiteId) {
        this.originalSiteId = originalSiteId;
    }

    public String getInternalStudyId() {
        return internalStudyId;
    }

    public void setInternalStudyId(String internalStudyId) {
        this.internalStudyId = internalStudyId;
    }

    public String getUnirEditionIni() {
        return unirEditionIni;
    }

    public void setUnirEditionIni(String unirEditionIni) {
        this.unirEditionIni = unirEditionIni;
    }

    public String getSectionsStudentSwitchingAllowed() {
        return sectionsStudentSwitchingAllowed;
    }

    public void setSectionsStudentSwitchingAllowed(String sectionsStudentSwitchingAllowed) {
        this.sectionsStudentSwitchingAllowed = sectionsStudentSwitchingAllowed;
    }

    public String getUnirEditionEnd() {
        return unirEditionEnd;
    }

    public void setUnirEditionEnd(String unirEditionEnd) {
        this.unirEditionEnd = unirEditionEnd;
    }

    public String getWithExtraCall() {
        return withExtraCall;
    }

    public void setWithExtraCall(String withExtraCall) {
        this.withExtraCall = withExtraCall;
    }

    public String getInternalSubjectId() {
        return internalSubjectId;
    }

    public void setInternalSubjectId(String internalSubjectId) {
        this.internalSubjectId = internalSubjectId;
    }

    public String getUnirZeroEnd() {
        return unirZeroEnd;
    }

    public void setUnirZeroEnd(String unirZeroEnd) {
        this.unirZeroEnd = unirZeroEnd;
    }

    public String getUnirDegree() {
        return unirDegree;
    }

    public void setUnirDegree(String unirDegree) {
        this.unirDegree = unirDegree;
    }

    public String getUnirExamIni() {
        return unirExamIni;
    }

    public void setUnirExamIni(String unirExamIni) {
        this.unirExamIni = unirExamIni;
    }

    public String getUnirSubjectCode() {
        return unirSubjectCode;
    }

    public void setUnirSubjectCode(String unirSubjectCode) {
        this.unirSubjectCode = unirSubjectCode;
    }

    public String getUnirSubjectType() {
        return unirSubjectType;
    }

    public void setUnirSubjectType(String unirSubjectType) {
        this.unirSubjectType = unirSubjectType;
    }

    public String getShowSurveys() {
        return showSurveys;
    }

    public void setShowSurveys(String showSurveys) {
        this.showSurveys = showSurveys;
    }

    public String getUnirSubjectIni() {
        return unirSubjectIni;
    }

    public void setUnirSubjectIni(String unirSubjectIni) {
        this.unirSubjectIni = unirSubjectIni;
    }

    public String getUnirtvSubjectId() {
        return unirtvSubjectId;
    }

    public void setUnirtvSubjectId(String unirtvSubjectId) {
        this.unirtvSubjectId = unirtvSubjectId;
    }

    public String getUnirIdplantilla() {
        return unirIdplantilla;
    }

    public void setUnirIdplantilla(String unirIdplantilla) {
        this.unirIdplantilla = unirIdplantilla;
    }

    public String getAutoDateCalcLaunched() {
        return autoDateCalcLaunched;
    }

    public void setAutoDateCalcLaunched(String autoDateCalcLaunched) {
        this.autoDateCalcLaunched = autoDateCalcLaunched;
    }

    public String getUnirSubjectEnd() {
        return unirSubjectEnd;
    }

    public void setUnirSubjectEnd(String unirSubjectEnd) {
        this.unirSubjectEnd = unirSubjectEnd;
    }

    public String getUnirCreditNumber() {
        return unirCreditNumber;
    }

    public void setUnirCreditNumber(String unirCreditNumber) {
        this.unirCreditNumber = unirCreditNumber;
    }

    public String getUnirSubjectGroups() {
        return unirSubjectGroups;
    }

    public void setUnirSubjectGroups(String unirSubjectGroups) {
        this.unirSubjectGroups = unirSubjectGroups;
    }

    public String getUnirSubjectCourse() {
        return unirSubjectCourse;
    }

    public void setUnirSubjectCourse(String unirSubjectCourse) {
        this.unirSubjectCourse = unirSubjectCourse;
    }

    public String getUnirSubject() {
        return unirSubject;
    }

    public void setUnirSubject(String unirSubject) {
        this.unirSubject = unirSubject;
    }

    public String getSakaiParentId() {
        return sakaiParentId;
    }

    public void setSakaiParentId(String sakaiParentId) {
        this.sakaiParentId = sakaiParentId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sectionsExternallyMaintained", sectionsExternallyMaintained).append("unirExtraIni", unirExtraIni).append("unirQEnd", unirQEnd).append("unirAcademicYearId", unirAcademicYearId).append("unirExamEnd", unirExamEnd).append("unirAcademicYear", unirAcademicYear).append("unirEdition", unirEdition).append("sectionsStudentRegistrationAllowed", sectionsStudentRegistrationAllowed).append("unirQIni", unirQIni).append("contentRepository", contentRepository).append("unirStudyTemplateId", unirStudyTemplateId).append("internalPeriodId", internalPeriodId).append("originalSiteId", originalSiteId).append("internalStudyId", internalStudyId).append("unirEditionIni", unirEditionIni).append("sectionsStudentSwitchingAllowed", sectionsStudentSwitchingAllowed).append("unirEditionEnd", unirEditionEnd).append("withExtraCall", withExtraCall).append("internalSubjectId", internalSubjectId).append("unirZeroEnd", unirZeroEnd).append("unirDegree", unirDegree).append("unirExamIni", unirExamIni).append("unirSubjectCode", unirSubjectCode).append("unirSubjectType", unirSubjectType).append("showSurveys", showSurveys).append("unirSubjectIni", unirSubjectIni).append("unirtvSubjectId", unirtvSubjectId).append("unirIdplantilla", unirIdplantilla).append("autoDateCalcLaunched", autoDateCalcLaunched).append("unirSubjectEnd", unirSubjectEnd).append("unirCreditNumber", unirCreditNumber).append("unirSubjectGroups", unirSubjectGroups).append("unirSubjectCourse", unirSubjectCourse).append("unirSubject", unirSubject).append("sakaiParentId", sakaiParentId).append("contactName", contactName).append("contactEmail", contactEmail).toString();
    }

}

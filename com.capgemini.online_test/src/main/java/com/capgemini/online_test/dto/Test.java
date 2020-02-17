package com.capgemini.online_test.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Set;

public class Test 
{
private BigInteger testId;
private String testTitle;
private LocalTime testDuration;
private Set<Question> testQuestions;
private BigDecimal testTotalMarks;
private BigDecimal testMarksScored;
private Question currentQuestion;
private LocalDateTime startTime;
private LocalDateTime endTime;
public BigInteger getTestId() {
	return testId;
}
public void setTestId(BigInteger testId) {
	this.testId = testId;
}
public String getTestTitle() {
	return testTitle;
}
public void setTestTitle(String testTitle) {
	this.testTitle = testTitle;
}
public LocalTime getTestDuration() {
	return testDuration;
}
public void setTestDuration(LocalTime testDuration) {
	this.testDuration = testDuration;
}
public Set<Question> getTestQuestions() {
	return testQuestions;
}
public void setTestQuestions(Set<Question> testQuestions) {
	this.testQuestions = testQuestions;
}
public BigDecimal getTestTotalMarks() {
	return testTotalMarks;
}
public void setTestTotalMarks(BigDecimal testTotalMarks) {
	this.testTotalMarks = testTotalMarks;
}
public BigDecimal getTestMarksScored() {
	return testMarksScored;
}
public void setTestMarksScored(BigDecimal testMarksScored) {
	this.testMarksScored = testMarksScored;
}
public Question getCurrentQuestion() {
	return currentQuestion;
}
public void setCurrentQuestion(Question currentQuestion) {
	this.currentQuestion = currentQuestion;
}
public LocalDateTime getStartTime() {
	return startTime;
}
public void setStartTime(LocalDateTime startTime) {
	this.startTime = startTime;
}
public LocalDateTime getEndTime() {
	return endTime;
}
public void setEndTime(LocalDateTime endTime) {
	this.endTime = endTime;
}

}

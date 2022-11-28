package com.wang.studentmsrv.service;

import com.wang.studentmsrv.domain.StudentExamResult;
import com.wang.studentmsrv.domain.dto.AnswersDTO;
import com.wang.studentmsrv.repository.StudentExamResultRepository;
import com.wang.studentmsrv.utils.AnyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamService {
    @Autowired
    private StudentExamResultRepository studentExamResultRepository;
    public void saveAnsweredPaper(AnswersDTO dto) {
        var studentExamResult = new StudentExamResult(dto.getStudentId(), dto.getExamId());
        studentExamResult.setAnsweredpaper(AnyUtil.objectToJsonmap(dto));
        studentExamResultRepository.save(studentExamResult);
    }
}
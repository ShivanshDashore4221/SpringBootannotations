package com.example.springbootAnno.springbootannotations.controller;

import com.example.springbootAnno.springbootannotations.service.MathSubject;
import com.example.springbootAnno.springbootannotations.service.Subject;

// by default, component name will be 's'ubjectController, to change it we can give name with @

//@Component("testSubjectController")
public class SubjectController
{
    //private constructor
//    @Autowired
//    @Qualifier("mathSubject") // first letter of class lowercase IMPORTANT
    private Subject subject; // so here, we have used Subject interface but comp gets confused as to which class does Subject point to? is it SubjectService or MathSubject? SO WE USE QUALIFIER HERE OR PRIMARY

    //constructor
//    @Autowired
    public SubjectController(Subject subjectService) {
        this.subject = subjectService;
    }

//  2.  private SubjectService subjectService;
    //constructor
//    @Autowired
//  1.  public SubjectController(SubjectService subjectService){
//        this.subjectService = subjectService;
//    }

//    @Autowired
//    //setter injection
//    public void setSubject(SubjectService subjectService){
//        this.subjectService=subjectService;
//    }

    public String getSubject(){
        //return "Math Subject" ; dummy value
//        return subjectService.getSubject();
        return subject.getSubject();
    }

    public void initBean(){
        System.out.println("initialization of a bean logic.");
    }
    public void destroyBean(){
        System.out.println("destruction of a bean logic");
    }
}
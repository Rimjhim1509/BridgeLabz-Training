package com.SkillForge;

public interface ICertifiable {
void generateCertificate();
}
//"SkillForge – Online Learning Portal"
//Story: A startup builds SkillForge, where instructors upload courses and students enroll,
//complete, and get certified.
//Requirements:
//● Course class: title, instructor, rating, modules[].
//● User class → Student, Instructor (inheritance).
//● Interface ICertifiable with generateCertificate() method.
//● Constructors for courses with default or custom module lists.
//● Use operators for grading, progress tracking.
//● Encapsulation: course rating logic protected.
//● Polymorphism: certificate format varies per course level.
//● Access Modifiers: internal course reviews are read-only.

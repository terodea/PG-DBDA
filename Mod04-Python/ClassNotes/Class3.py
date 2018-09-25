#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Sep 15 09:19:13 2018

@author: student
"""
class Student:
    start_stud_id = 100 #class atrribute
    def get_fullname(self):
        return self.firstname + " " + self.lastname
    def __init__(self, name='NA', last='NA', phone='0'):
        self.firstname = name
        self.lastname = last
        self.email = name + '.' + last + '@cdac.com'
        self.phone = phone
        self.stud_id = Student.start_stud_id + 1
        Student.start_stud_id += 1
    
    def stud_details(self):
        print(self.stud_id, ":", self.get_fullname())

print(Student.start_stud_id)
s1 = Student('Aakash', 'Sharma', '+91 9836467')

print(Student.start_stud_id)
s1.stud_details()

s2 = Student('Mohan', 'Pandit', '+91 937356')
print(Student.start_stud_id)
s2.stud_details()
s3 = Student()
print(Student.start_stud_id)
s4 = Student()
print(Student.start_stud_id)

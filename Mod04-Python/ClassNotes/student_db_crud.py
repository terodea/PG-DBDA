#!/usr/bin/env python3
# -*- coding: utf-8 -*-
help(dict)
import sys
def get_details():
    s = []
    s.append(input('Enter name: '))
    s.append(input('Enter age: '))
    return s

def add_stud_info(stud_info):
    '''add new record for student info
    arguments : stud_info dict
    returns None'''
    prn = int(input('Enter the PRN number: '))
    s = get_details()
    stud_info[prn] = s
def dump_stud_info_to_file(stud_info):
    data = str(stud_info)
    with open(r'/home/noobwithskills/stud_info.csv', 'w+') as file:
        file.write(data)
        
def update_stud_info(stud_info):
    pass
def delete_stud_record(stud_info):
    who = int(input('enter prn to delete: '))
    if who in stud_info:
        del stud_info[who]
        print(who, 'deleted successfully')
    
def display_stud_info(stud_info):
    print(stud_info)

if __name__ == '__main__':
    stud_info = {}
    while True:
        print('1. Add student info')
        print('2. Update student info')
        print('3. Remove/delete student info')
        print('4. Display student info')
        print('5. Dump the student info into a file')
        print('6. Exit')
        option = int(input('Enter the option [1-6]: '))
        if option == 1:
            add_stud_info(stud_info)
        elif option == 2:
            update_stud_info(stud_info)
        elif option == 3:
            delete_stud_record(stud_info)
        elif option == 4:
            display_stud_info(stud_info)
        elif option == 5:
            dump_stud_info_to_file(stud_info)
        else:
            sys.exit('Done. Exiting..')
#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep 13 18:53:19 2018

@author: student
"""
import re
def validate_email(email):
    print(email)
    match = re.search('[a-zA-Z._0-9]+@[a-z]+\.[a-z]+', email)
    if len(email) == len(match.group()):
        return True
    return False


def validate_email1(email):
    print(email)
    match = re.search('^[a-z._0-9]+\@', email)
    if match:
        return True
    return False


email = input('Enter an email address: ')
print(validate_email1(email))
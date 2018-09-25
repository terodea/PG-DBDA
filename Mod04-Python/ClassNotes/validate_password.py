#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Thu Sep 13 19:35:28 2018

@author: student
"""

import re
def validate_password(password):
    if len(password) > 8:
        m1 = re.search('[a-z0-9@!#$%^&*]', password)
        m2 = re.search('[A-Z]', password)
        if m1 and m2:
            return True
    return False

p = input('Enter a password: ')
print(validate_password(p))

#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Sep 14 15:24:55 2018

@author: student
"""

try:
    with open('/home/student/Desktop/NSE-INFY.csv', 'r') as infy:
        
#        print(infy.readlines()[1:10])
#        for line in infy.readlines()[1:]:
#            closing_price = float(line.split(',')[5])
#            print(closing_price)
        #close = []
        d = {}
        for line in infy:
            closing_price = line.split(',')[5]
            if closing_price == 'Close':
                continue
            #close.append(float(closing_price))
            date = line.split(',')[0]
            year = date.split('-')[0]
            if year in d:
                d[year].append(float(closing_price))
            else:
                d[year] = [float(closing_price)]
        
        for item in d:
            print('Close price for {} is {}'.\
                  format(item, sum(d[item])/len(d[item])))
        #print(sum(close) / len(close))
except IOError as err:
    print('File not found --> ', err)
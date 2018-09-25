#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Sep 15 11:52:26 2018

@author: student
"""
import sys
import random
# import sys, random
class BankAccount():
    min_acc_balance = 0
    def __init__(self):
        self.acc_balance = 0
        
    def get_details(self, acc_type='Savings'):
        self.name = input('Enter customer name: ')
        self.acc_number = random.randint(100, 150)
        self.acc_type = acc_type
        
    def deposit_amount(self, amount):
        self.acc_balance += amount
    
    def withdraw_amount(self, amount):
        if self.acc_balance > amount:
            self.acc_balance -= amount
        else:
            print('Insufficient Funds to withdraw')
    
    def get_balance(self):
        return self.acc_balance
    
    def display_acc_details(self):
        
        print(self.acc_number,"\t", self.name,"\t", self.get_balance())
    
def Display(accounts):
    for account in accounts.values():
        account.display_acc_details()
    
def main():
    accounts = {}
    while True:
        print('1. Open the bank account')
        print('2. Withdraw amount')
        print('3. Deposit amount')
        print('4. Display details')
        print('5. Exit')
        choice = int(input('Enter choice: '))
        if choice == 1:
            account = BankAccount()
            account.get_details()
            accounts[account.acc_number] = account
        elif choice == 2:
            acc = int(input('Withdraw account: '))
            amount = int(input('Enter amount to withdraw: '))
            accounts[acc].withdraw_amount(amount)
        elif choice == 3:
            acc = int(input('Deposit account: '))
            amount = int(input('Enter amount to deposit: '))
            accounts[acc].deposit_amount(amount)
        elif choice == 4:
            print('Account\tName\tBalance')
            Display(accounts)
        else:
            sys.exit('Done')

if __name__ == '__main__':
    main()
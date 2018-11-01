---
title: "Day5"
author: "Akshay Terode"
date: "1 November 2018"
output:
  html_document: default
  pdf_document: default
  word_document: default
---
###Q1 :-
####Ice Cream Manufacture is to produce a new ice-cream flavor. The company‘s marketing research department surveyed 6,000 families and 335 of them showed interest in purchasing the new flavor. A similar study made two year ago showed that 5% of the families would purchase the flavor. What should the company conclude regarding the new flavor?
```{r}
n=6000
p_bar = 335/6000
z <- (p_bar - 0.05)/sqrt(0.05*(1-0.05)/6000)
z

p <- 1-pnorm(z)
p
```
###Q3 :-
####Call centers typically have high turnover. The director of human resources for a large bank has compiled data on about 70 former employees at one of the bank’s call centers in the Excel file Call Center Data. In writing an article about call center working conditions, a reporter has claimed that the average tenure is no more than 2 years. Formulate and test a hypothesis using these data to determine if this claim can be disputed.
```{r}
#Ho : mu <= 2
#H1  : mu > 2
#Criteria : Right tailed test
library(readxl)
calcenter <-read_xlsx("/home/student/RCodes/Stats With R/Data_Files/Call Center Data.xlsx",1,range = "A4:E74")
t.test(calcenter$`Length of Service (years)`,mu = 2,alternative = c("greater"))
```
Result : We don't reject Ho because p-value = 0.7885 > 0.05 <br>
Conclusion : The claim of reporter that avg tenure is no more than 2 years is available.

###Q3 : -
####The manager of a store claims that 60% of the shoppers entering the store leave without making a purchase. Out of a sample of 50, it is found that 35 shoppers left without buying. Is the result consistent with the claim?
```{r}
#Ho : p = 0.6
#H1 : p != 0.6
n = 50
p_bar = 35/50
z <- (p_bar - 0.6)/sqrt(0.6*(1-0.6)/50)
z

pval_left <- pnorm(-z)
pval_left
pval_right <- 1- pnorm(z)
pval_right
twotailedPval <- pval_left+pval_right
twotailedPval
```
Result : We don't reject Ho ad p-value = 0.1489147 > 0.05 at 5% level of significance. <br>
Conclusion : Manager's claim that 60% of shoppers entering the store leave without making a purchase may be true.<br>

# Test for Difference
```{r}
n1<-80
p1<-63/80
n2<-120
p2<-70/120
p <-((80*63/80)+(120*70/120))/(80+120)
z<- (p1 - p2)/sqrt((p*(1-p))*(1/n1)+(1/n2))
z
```
# Paired t-test
```{r}
library(MASS)
data("anorexia")
contAnorex <- subset(anorexia,Treat == "Cont")
t.test(contAnorex$Prewt,contAnorex$Postwt,mu = 0,paired = T)

contAnorexT2 <- subset(anorexia,Treat == "CBT")
t.test(contAnorexT2$Prewt,contAnorexT2$Postwt,mu = 0,paired = T)

contAnorexT3 <- subset(anorexia,Treat == "FT")
t.test(contAnorexT3$Prewt,contAnorexT3$Postwt,mu = 0,paired = T,alternative = c("less"))
```
## Cont :
- CBT : p-value = 0.03502
  - Result :We reject HO
  - Conclusion : CBT may be effective
- FT : p-value = 0.0007
  - Result : We reject HO
  - Conclusion : FT may be effective
  
```{r}
library(readxl)
ohio <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Ohio Education Performance.xlsx",1,range ="A3:G34")
t.test(ohio$Writing,ohio$Reading,paired = T)
t.test(ohio$Math,ohio$Science,paired = T)
```
```{r}
library(readxl)
earnings <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Earnings2005.xlsx",1,range = "A2:C27")
t.test(earnings$Current,earnings$Previous,alternative = "g",paired = T)
```
```{r}
y <- c(14.3,23.2,22.7,33.9,22.9,22.9,10.4,9.3,2.4)
category <- c("A","A","B","B","A","B","A","B","B")
category <-factor(category)
ay <- y[category == "A"]
by <- y[category == "B"]
var.test(ay,by)
```

```{r}
y <- c(14.3,23.2,22.7,33.9,22.9,22.9,10.4,9.3,2.4)
category <- c("A","A","B","B","A","B","A","B","B")
var.test(y ~ category)
```
#### Using the data in the Excel file Student Grades,which represent exam scores in one section of a large statistics course, test the hypothesis that the variance in grades is the same for both tests.
```{r}
library(readxl)
stud <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Student Grades.xlsx",1,range = "A3:C59")
var.test(stud$Midterm,stud$`Final Exam`)
```
**Result :** Reject Ho because p-value > 0.05 <br>
**Conclusion :** Variance are equal <br>

#### Using the Excel file Facebook Survey, determine if the mean number of hours spent online per week is the same for males as it is for females.
```{r}
library(readxl)
fb <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Facebook Survey.xlsx",1,range = "A3:D36")
var.test(fb$`Hours online/week` ~ fb$Gender)
t.test(fb$`Hours online/week` ~ fb$Gender,var.equal = T)
```

- **Conclusion :** The two arithmetic means are equal.i.e hours spend by man and women on an average are equal.

#### Determine if there is evidence to conclude that the mean GPA of males who plan to attend graduate school is larger than that of females who plan to attend graduate school using the data in the Excel file Graduate School Survey ?
```{r}
library(readxl)
df <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Graduate School Survey.xlsx",1,range = "A3:D33")
ss <- subset(df,`Plan to attend graduate school` == "yes")
var.test(ss$`Undergraduate GPA` ~ ss$Gender)
t.test(ss$`Undergraduate GPA` ~ ss$Gender,var.equal = T)
```
### **Q :-**
#### The Excel file Accounting Professionals provides the results of a survey of 27 employees in a tax division of a Fortune 100 company.
- a. Test the null hypothesis that the average number of years of service is the same for males and females.
- b. Test the null hypothesis that the average years of undergraduate study is the same for males and females.
```{r}
library(readxl)
df <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Accounting Professionals.xlsx",1,range = "A3:G30")
#a
var.test(df$`Years of Service` ~ df$Gender)
t.test(df$`Years of Service` ~ df$Gender,var.equal = F)
#b
var.test(df$`Years Undergraduate Study` ~ df$Gender)
t.test(df$`Years Undergraduate Study` ~ df$Gender,var.equal = F)
```
# ANOVA


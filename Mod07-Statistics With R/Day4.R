# Ex
##Q1
dgeom(x = 10,prob = 0.2)
##Q2
pgeom(q = 10,prob = 0.2)
1/0.2
##Q3
rgeom(50,0.2)

#Negative Binomial Distribution
#Q1
dnbinom(x=17,size = 7,prob = 0.2)
#Q2
pnbinom(q=20,size = 7,prob = 0.2)
#Q3
3*0.8/0.2

# Exponential Distribution
#Q41
pexp(5000,1/4750,lower.tail = F)
#Q42
pexp(30,1/20,lower.tail = F)
pexp(20,1/20)

w <- rexp(100,1/20)
w
delayed <- ifelse(w<=25,"On Time","Delayed")
table(delayed)


# Q13
#The Excel file Sales Data provides data on a sample
# of customers. An industry trade publication stated
# that the average profit per customer for this industry
# was at least $4,500. Using a test of hypothesis, do the
# data support this claim or not?

library(readxl)
setwd("/home/student/RCodes/Stats With R/Data_Files")
sales <- read_xlsx("Sales Data.xlsx",1,range = "A3:F63")
t.test(sales$`Gross Profit`,mu = 4500,alternative = c("less"))

#Q16
# Using the data in the Excel file Consumer Transportation Survey,
# test the following null hypotheses:
# a. 	 Individuals spend at least 8 hours per week in their vehicles.
# b.   Individuals drive an average of 600 miles per week.
# c. 	 The average age of SUV drivers is no greater than 35.
# d. 	 At least 80% of individuals are satisfied with their vehicles.
library(readxl)
setwd("/home/student/RCodes/Stats With R/Data_Files")
cts <- read_excel("Consumer Transportation Survey.xlsx",1,range = "A3:J53")
#Q1
t.test(cts$`# of hours per week in vehicle`,mu = 8,alternative = c("less"))
#Q2
t.test(cts$`Miles driven per week`,mu = 600,alternative = c("two.sided"))
#Q3
ss_cons <- subset(cts,`Vehicle Driven`=='SUV')
t.test(ss_cons$Age,mu = 35, alternative = c("greater"))
#Q4
table(cts$`Satisfaction with vehicle`)
n=50
pbar=35/n
pO=0.8
z=(pbar-pO)/sqrt(pO*(1-pO)/n)
z
pnorm(z)

#Excercise
setwd("/home/student/RCodes/Stats With R/5. Hypothesis Testing/One Sample t Exercises")
#Q1
# Suppose a firm producing light bulbs wants to know whether it can claim that its bulbs typically last
# more than 1000 burning Hours. The firm collects the data of 100 light bulbs and records the lifetime
# (in hours) of each. Justify the claim for 5% significance level. The sample data are contained in the
# file Lightbulbs.csv.
bulb <- read.csv("Lightbulbs.csv",header = TRUE)
t.test(bulb$Lifetime,mu = 1000,alternative = c("greater"))

#Q2
# A producer of steel cables wants to know whether the steel cables it produces have an average
# breaking strength of 5000 pounds. An average breaking strength of less than 5000 pounds would
# not be adequate and if the steel cables produces with an excess average breaking strength than
# unnecessarily increases the production costs. The producer collects a random sample of 64 steel
# cables pieces. The strength breaking record for each steel cables is contained in the file
# steel_cables.csv.
cables <-read.csv("steel_cables.csv",header = TRUE)
t.test(cables$Breaking_Strength,mu = 5000,alternative = c("two.sided"))

1-pnorm(1)
# In an example in Chapter 3, we developed the following cross-tabulation of sales transaction data:
# Region  Book DVD Total
# East    56   42  98
# North   43   42  85
# South   62   37  99
# West    100  90  190
# Total   261  211472
# a. 	 Find the marginal probabilities that a sale originated in each of the four regions and the marginal probability of each type of sale (book or DVD).
# b. 	 Find the conditional probabilities of selling a book given that the customer resides in each region.
East <- c(56,42)
North <- c(43,42)
South <- c(62,37)
West <- c(100,90)
rb <-rbind(East,North,South,West)
colnames(rb) <- c("Book","DVD")

prop.table(rb)
addmargins(prop.table(rb))
rb
#SOLUTION a -
#SOLUTION b - 
#For row-proportions its 1
prop.table(rb,1)
#For colums-proprotions its 2
prop.table(rb,2)
#Q15
library(readxl)
df <- read_excel("/home/student/RCodes/Stats With R/Data_Files/Census Education Data.xlsx",range="A26:G28",col_names= F)
colnames(df) <- c("Categories","Not HS","HS","SND","AD","BS","ADeg")
rownames(df) <- df$Categories
df
dfDF <- as.data.frame(df)
dfDF <- dfDF[,-1]
row.names(dfDF) <- categories
dfDF <- dfDF[,-1]
dfDF <- as.matrix(dfDF)
prop.table(dfDF)
prop.table(dfDF,1)
prop.table(dfDF,2)
addmargins(prop.table(dfDF))
# Q22
#The weekly demand of a slow-moving product has the following probability mass function:
#|----------------------|
#| Demand  | Probability|
#|   0     |    0.2     |
#|   1     |    0.4     |
#|   2     |    0.3     |
#|   3     |    0.1     |
#|----------------------|
#Find the expected value, variance, and standard de-viation of weekly demand.
Demand <- c(0,1,2,3)
Probability <- c(0.2,0.4,0.3,0.1)
cb <- cbind(Demand,Probability)
ExpV <- sum(Demand*Probability)
ExpV
ExSq <- sum(Demand*Demand*Probability)
varX <- ExSq - (ExpV^2)
varX
sqrt(varX)
#Q10
# A survey of 200 college graduates who have been working for at least 3 years found that 90 owned only mutual funds, 20 owned only stocks, and 70 owned both.
# a.What is the probability that an individual owns a stock ? A mutual fund ?
# b.What is the probability that an individual owns neither stocks nor mutual funds ?
# c.What is the probability that an individual owns either a stock or a mutual fund ?

# Binomial Distribution
dbinom(5,40,0.25)
s <- 0
for(i in 0:10){
  s <- s+dbinom(i,40,0.25)
}
s
pbinom(10,40,0.25)
1-pbinom(19,40,0.25)

a <- 40*0.25
a
b <- sqrt(40*0.25*0.75)
b
#	 If a cell phone company conducted a telemarketing campaign to generate new clients and the 
#probability of successfully gaining a new customer was 0.07, what is the probability that contacting 50
#potential customers would result in at least 5 new customers?
1-pbinom(4,50,0.07)
pbinom(4,50,0.07,lower.tail = F)

#Q29
pbinom(279,300,0.94,lower.tail=F)

a <- rbinom(100,300,0.94)
300*0.94
mean(a)


# Poisson Distribution
#Ex
#Q a
dpois(5,12)
#Q b
ppois(12,12)

#Q32
#The number and frequency of Atlantic hurricanes annually from 1940 through 2012 is shown here.
#|--------|----------|
#| Number | Frequency|
#|  0     |    5     |
#|  1     |   16     |
#|  2     |   19     |
#|  3     |   14     |
#|  4     |    3     |
#|  5     |    5     |
#|  6     |    4     |
#|  7     |    3     |
#|  8     |    2     |
#|  10    |    1     |
#|  12    |    1     |
#|--------|----------|
#Qa.Find the probabilities of 0–12 hurricanes each season using these data.
#Qb Assuming a Poisson distribution and using the mean number of hurricanes per season from the empirical data, compute the probabilities of experiencing 0–12 hurricanes in a season. Compare these to your answer to part (a). How good does a Poisson distribution model this phenomenon? Construct a chart to visualize these results.
hurr <- c(0,1,2,3,4,5,6,7,8,10,12)
freq <- c(5,16,19,14,3,5,4,3,2,1,1)
df <- cbind(hurr,freq)
newt <- prop.table(freq)
newt
mu <- sum(hurr*freq)/sum(freq)
mu
dpois(0,mu)

1-pnorm(225,180,30)

#Q 36 
# n determining automobile-mileage ratings, it was found that the mpg (X) for a certain model is normally distributed, with a mean of 33 mpg and a standard deviation of 1.7 mpg. Find the following:
#a.P(X <30)
#b.P(28 < X < 32)
#c.P(X>35)
#d.P(X>31)
#e The mileage rating that the upper 5% of cars achieve.
#a
pnorm(30,33,1.7)
#b
pnorm(32,33,1.7)-pnorm(28,33,1.7)
#c
1-pnorm(35,33,1.7)
#d
1-pnorm(31,33,1.7)
#e
qnorm(0.95,33,1.7)
#Q37
#The distribution of the SAT scores in math for an incoming class of business students has a mean of 590and standard deviation of 22. Assume that the scores are normally distributed.
# a. Find the probability that an individual’s SAT score is less than 550.
# b. Find the probability that an individual’s SAT score is between 550 and 600.
# c. Find the probability that an individual’s SAT score is greater than 620.
# d. What percentage of students will have scored better than 700?
# e. Find the standardized values for students scoring 550, 600, 650, and 700 on the test.
#Sol-a
pnorm(550,590,22)
#Sol-b
pnorm(600,590,22)-pnorm(550,590,22)
#Sol-c
1-pnorm(620,590,22)
#Sol-d
(1-pnorm(700,590,22))*100
#Sol-e
vals <- c(550,600,650,700)
(vals-590)/22

p_s <- 1-pnorm(450,313,57)
p_w <- 1-pnorm(150,93,22)
p_s + p_w - p_w*p_s
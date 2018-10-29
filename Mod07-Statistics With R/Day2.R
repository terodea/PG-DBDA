#Q1
setwd("/home/student/RCodes/Stats With R/Datasets")
ord = read.csv("Orders.csv")
ord
#Q1.1
str(ord)
#Q1.2
summary(ord)

#Q2
bol = read.csv("Bollywood_2015.csv")
bol
bo_collection=cut(bol$BO_Collection,breaks = c(1,67,133,199,265,331))
bo_collection
prop.table(cut(bol$BO_Collection,breaks = c(1,67,133,199,265,331)))
#Q3
load("/home/student/RCodes/Stats With R/Datasets/events.RData")
dur <- rep(NA,15)
dur[1] <- events$occur[1]
for (i in 2:15){
  dur[i] <- events$occur[i] - events$occur[i-1]
}
evts <- cbind(events,dur)
evts
#or
dur[1] <- events$occur[1]
dur[2:15] <- diff(events$occur)
evts <- cbind(events,dur)
evts

#Q5
convert_kelvin_to_farhen <- function(temp) {
  celsius <- ((temp - 32) * (5 / 9))
  return(celsius)
}

convert_kelvin_to_farhen(132)
# Q6
test <- function(input) {
  v1 = mean(input,na.rm = TRUE) - 2*sd(input,na.rm = TRUE)
  v2 = mean(input,na.rm = TRUE) + 2*sd(input,na.rm = TRUE)
  df <- data.frame(v1,v2)
  df
}
test(mtcars$cyl)

#Q7
cvtest <- function(input){
  cv <- (sd(input,na.rm = TRUE)/mean(input,na.rm = TRUE))*100 
  cv
}
cvtest(mtcars$cyl)

# Q8
df <- data.frame(a=c(2,3,4,NA,5,NA),b=c(1,2,3,4,NA,NA))
fillNAwithMean <- function(x){
  na_index <- which(is.na(x))        
  mean_x <- mean(x, na.rm=T)
  x[na_index] <- mean_x
  return(x)
}
(df <- apply(df,2,fillNAwithMean))

#or
g <- c(NA,2,90.2,3,4,NA)
imputed <- function(g) {
  mu <- mean(g,na.rm= T)
  ImputedG <- ifelse(is.na(g) == TRUE, mu,g)
  ImputedG
}

lst <- list(a=c(1,2,3,4,5,6),b=c(10,20),c=c(1,2,3))
lst
lapply(lst,mean)
################################################################################################
library(mlbench)
data("Sonar")
Sonar
cvtest <- function(input){
  cv <- (sd(input,na.rm = TRUE)/mean(input,na.rm = TRUE))*100 
  cv
}

sapply(Sonar[,-61],cvtest)
#Q2
test1 <- function(input) {
  v1 = mean(input,na.rm = T) - 3*sd(input,na.rm = T)
  v2 = mean(input,na.rm = T) + 3*sd(input,na.rm = T)
  df <- data.frame(v1,v2)
  df
}
listdv <- list(binomialDist=rbinom(50000,10000,0.023),poissonDist=rpois(45000,230),normalDist=rnorm(40000,230,30),normalDist2=rnorm(40000,230,40))

lapply(listdv,test1)
#Q3
test2 <- function(input) {
  v1 = mean(input,na.rm = T)
  v2 = sd(input,na.rm = T)
  df <- data.frame(v1,v2)
  df
}
listd <- list(binomialDist=rbinom(50000,10000,0.023),poissonDist=rpois(45000,230),normalDist=rnorm(40000,230,30),normalDist2=rnorm(40000,230,40))
mapply(test2,listd)

#Q4
library(carData)
data("Salaries")
tapply(Salaries$salary, Salaries$rank,mean)
#Q5
library(Ecdat)
data("Housing")
listNums <- lapply(Housing,is.numeric)
nums <- unlist(listNums)
HousingNum <- Housing[,nums]
HousingNum
listfct <-lapply(Housing, is.factor)
facts <- unlist(listfct)
HousingFact <- Housing[,facts]
HousingFact


#################################
males <-c(123,24,17,52,8)
females <- c(86,8,10,73,4)
rb <- rbind(males,females)
colnames(rb) <- c("Canada","US","Europe","Asia","Other")

prop.table(rb)
addmargins(prop.table(rb))
rb
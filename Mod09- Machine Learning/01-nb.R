#Clean the work environment
rm(list = ls())

#set working directory
setwd("/home/student/ML")

#load mlbench library
library(mlbench)

#load HouseVotes84 dataset
data("HouseVotes84")
summary(HouseVotes84)


#############Function to remove NA ############################
# function to return number of NAs by vote and class (democrat or republic)
na_by_col_class <- function(coL,cls){
  return(sum(is.na(HouseVotes84[,col]) & HouseVotes84$Class==cls))
}


p_y_col_class <- function(coL,cls){
  sum_y <- sum(HouseVotes84[,col]=='y'& HouseVotes84$Class==cls,na.rm = TRUE)
  sum_n <- sum(HouseVotes84[,col]=='n'& HouseVotes84$Class==cls,na.rm = TRUE)
  return(sum_y/(sum_y+sum_n))
}

################### impute missing values ######################
for(i in 2:ncol(HouseVotes84)){
  if(sum(is.na(HouseVotes84[,i])>0)){
    c1 <- which(is.na(HouseVotes84[,i]) & HouseVotes84$Class == 'democrat',arr.ind = TRUE)
    c2 <- which(is.na(HouseVotes84[,i]) & HouseVotes84$Class =='republican',arr.ind = TRUE)
    HouseVotes84[c1,i]<- ifelse (runif(na_by_col_class(i,'democrat'))< p_y_col_class(i,'democrat'),'y','n')
    HouseVotes84[c1,i]<- ifelse (runif(na_by_col_class(i,'republican'))< p_y_col_class(i,'republican'),'y','n')
  }
}

################### Training & Testing ##########################
HouseVotes84[,'train'] <- ifelse (runif(nrow(HouseVotes84))<0.80,1,0)

#get col number of train/test indicator column 
trainColNum <- grep("train",names(HouseVotes84))

#seperate training and test sets and remove training column before modeling
trainHouseVotes84 <- HouseVotes84[HouseVotes84$train==1,-trainColNum]
testHouseVotes84 <- HouseVotes84[HouseVotes84$train==0,-trainColNum]


########################## NAIVE BAYES ############################
library(e1071)
nb_model <- naiveBayes(Class~.,data = trainHouseVotes84)

#Prediction
nb_test_predict <- predict(nb_model,testHouseVotes84[,-1])

#Confusion Matrix
table(pred = nb_test_predict,true=testHouseVotes84$Class)

# Manually Calculate Accuracy
# Acc = (TP + TN )/ (TP + TN +FP +FN)
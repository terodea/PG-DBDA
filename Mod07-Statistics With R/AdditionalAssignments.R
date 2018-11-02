setwd("/home/student/Desktop/Stats With R/lab")
##############################################################################################################################
#Q1.]
#Q1.A
mushroom <- read.table("https://archive.ics.uci.edu/ml/machine-learning-databases/mushroom/agaricus-lepiota.data", sep=",") 

#Q1.B
colnames(mushroom) <- c("Class","Cap_shape","Cap_surface","Cap_color","Bruises","Odor","Gill_attach","Gill_spacing",
                        "Gill_size","Gill_color","Stalk_shape","Stalk_root","Stalk_S_A_Ring","Stalk_S_B_Ring",
                        "Stalk_C_A_Ring","Stalk_C_B_Ring","Veil_type","Weil_color","Ring_number","Ring_type",
                        "Spore_P_Color","Population","Habitat")            

#Q1.C
write.csv(mushroom, "mushroom.csv")
##############################################################################################################################

#Q2.]
library(readxl)
#air11 <-read.csv2("/home/student/Desktop/Stats With R/lab/AirQualityUCI/AirQualityUCI.csv", header = TRUE, sep = ";")
#air22 <- read_excel("/home/student/Desktop/Stats With R/lab/AirQualityUCI/AirQualityUCI.xlsx",range = "A1:O9358")
air1 <- data.frame(read.csv2("/home/student/Desktop/Stats With R/lab/AirQualityUCI/AirQualityUCI.csv", header = TRUE, sep = ";"))
air2 <- data.frame(read_excel("/home/student/Desktop/Stats With R/lab/AirQualityUCI/AirQualityUCI.xlsx",range = "A1:O9358"))

air1_new <- air1[ , ! apply( air1 , 2 , function(x) all(is.na(x)) ) ]
air2_new <- air1[ , ! apply( air2 , 2 , function(x) all(is.na(x)) ) ]
AIR1_O <-na.omit(air1, cols=seq_along(air1), invert=FALSE)

##############################################################################################################################
#Q3.]Problem 24, Page No. 255


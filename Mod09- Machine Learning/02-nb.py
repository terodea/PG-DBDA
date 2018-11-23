#Naive Bayes Classifier

#Import / Load libraries
from pandas import read_csv
from sklearn.naive_bayes import GaussianNB
from sklearn.model_selection import train_test_split
from sklearn.metrics import confusion_matrix,accuracy_score

# 
filename = 'Diabetes.csv'
dataframe = read_csv(filename)

# Seperate Input features X and Class variable Y
array = dataframe.values
X = array[:,0:8]
Y = array[:,8]

# Split Training and Testing Data
X_train,X_test,Y_train,Y_test = train_test_split(X,Y,test_size = 0.2,random_state=1)


#Initialize a Naive Bayes model
model = GaussianNB()

#Fit the model on given data
model.fit(X_train,Y_train)

#Predict using Naive bayes Model
Y_predict = model.predict(X_test)

#Calculate Confusion Matrix
cf_mat = confusion_matrix(Y_test,Y_predict)

#Calculate Accuracy
acc = accuracy_score(Y_test,Y_predict)

#Print Results
print("Confusion Matrix",cf_mat)
print("Accuracy : ",acc)
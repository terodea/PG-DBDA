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
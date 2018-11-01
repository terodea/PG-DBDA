# Ice Cream Manufacture is to produce a new ice
# cream flavor. The company‘s marketing research department 
# surveyed 6,000 families and 335 of them
# showed interest in purchasing the new flavor. A 
# similar study made two year ago showed that 5% of the
# families would purchase the flavor. What should the
# company conclude regarding the new flavor?
n1<-80
p1<-63/80
n2<-120
p2<-70/120
p <-((80*63/80)+(120*70/120))/(80+120)

z<- (p1 - p2)/sqrt((p*(1-p))*(1/n1)+(1/n2))
z

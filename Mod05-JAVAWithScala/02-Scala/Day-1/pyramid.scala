def isPyramid(x:Int)={
	var range=x
        for(i<- 0 to range) 
        {      
            for(j<-0 to i) 
            {  
                print("* "); 
            } 
  
            // ending line after each row 
            println(); 
        }
}

isPyramid(5) 

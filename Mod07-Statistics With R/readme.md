# R

## Basics Of Stats
- X1,X2,.....,Xn : Values
- Xi : ith value
- Mean (mu) = (Sum Xi)/N
- Xi - mu : Deviation from mean
    - Problem : Sum(Xi - mu)
        - summing mu N times.So it will be mu*N.
        - sum Xi - Xi = 0
- | Xi - mu | : Absolute deviation from mean.
- Avg(|xi - mu|) : Mean deviation from mu
    - {sum(|xi - mu|)}/N
- <a href="https://www.codecogs.com/eqnedit.php?latex=\sum_{i=1}^{N}&space;=&space;X_{i}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\sum_{i=1}^{N}&space;=&space;X_{i}" title="\sum_{i=1}^{N} = X_{i}" /></a>
## Measure of desperssion
- Range
    - Largest - smallest
- Quartile Deviation or Semi-Quartile Range
    - QD = (Q3-Q1)/2
- Mean Deviation
    - Bigger the mean deviation lesser is the consistency.
    - AM are misleading in consistenct. Hence use Mean Deviation
- Squared Deviation - (Xi - mu) ^ 2
    - Average of squared deviation is "variance".
- Standard Deviation ((Xi - mu) ^2)^ 1/2

## Co-efficient Of Variation
- Also a measure of depression
- Usefull in feature selection.
- The ratio of SD and Mean
- CV is unit less quantity
- CV = (SD/MEAN)*100
- CV =(sigma/mu)*100
- Lesser the quantity, more is the variance.

## Skewness and Kurtosis
- Skewness
    - Measure of asymmetry of a frequency distribution
        - skewed to left.
        - symmetric or unskewed.
        - skewed to right.
- Kurtosis
    - Measure of flatness or peakedness of a frequency of distribution
        - Platykurtic (relatively flat)
        - Mesokurtic (normal)
        - Lepotkurtic (relatively peaked)


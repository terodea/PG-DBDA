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
    - Coefficient Of Skewness(CS):
        - <a href="https://www.codecogs.com/eqnedit.php?latex=CS&space;=&space;\frac{1}{N}&space;\sum_{i=1}^{N}(x_{i}&space;-&space;)^3&space;/\sigma&space;^3" target="_blank"><img src="https://latex.codecogs.com/gif.latex?CS&space;=&space;\frac{1}{N}&space;\sum_{i=1}^{N}(x_{i}&space;-&space;)^3&space;/\sigma&space;^3" title="CS = \frac{1}{N} \sum_{i=1}^{N}(x_{i} - )^3 /\sigma ^3" /></a>
        - CS is +ve for right-skewed data.
        - CS is -ve for left-skewed data.
        - |CS| > 1 suggests high degree of skewness.
        - 0.5 <= |CS| <= 1 suggests moderate skewness.
        - |CS| < 0.5 suggests realtive symmetry.
- Kurtosis
    - Measure of flatness or peakedness of a frequency of distribution
        - Platykurtic (relatively flat)
        - Mesokurtic (normal)
        - Lepotkurtic (relatively peaked)
    - Coefficient of kurtosis (CK):
        - <a href="https://www.codecogs.com/eqnedit.php?latex=CS&space;=&space;\frac{1}{N}&space;\sum_{i=1}^{N}(x_{i}&space;-&space;)^4&space;/\sigma&space;^4" target="_blank"><img src="https://latex.codecogs.com/gif.latex?CS&space;=&space;\frac{1}{N}&space;\sum_{i=1}^{N}(x_{i}&space;-&space;)^4&space;/\sigma&space;^4" title="CS = \frac{1}{N} \sum_{i=1}^{N}(x_{i} - )^4 /\sigma ^4" /></a>
        - CK < 3 indicates data is somewhat flat with a wide degree of dispersion.
        - CK > 3 indicates data si somehwat peaked with less dispersion
        - R function : kurtosis(numeric vector)


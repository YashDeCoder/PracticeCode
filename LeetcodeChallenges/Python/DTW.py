import numpy as np

def d(x1, x2,y1,y2 ):
    return abs(x1 - x2) + abs(y1-y2)  # Manhattan distance

def DTWDistance(s, t):
    n = len(s)
    m = len(t)
    
    # Initialize DTW matrix with infinity
    DTW = np.full((n + 1, m + 1), np.inf)
    DTW[0, 0] = 0
    
    # # Fill the DTW matrix
    # for i in range(1, n + 1):
    #     for j in range(1, m + 1):
    #         cost = d(i-1,j-1,s[i - 1], t[j - 1] )
    #         DTW[i, j] = cost + min(DTW[i - 1, j],    # insertion
    #                                DTW[i, j - 1],    # deletion
    #                                DTW[i - 1, j - 1]) # match

    # Fill the DTW matrix with the constraint of time point differences
    for i in range(1, n + 1):
        for j in range(max(1, i-1), min(m + 1, i + 2)):
            cost = d(i-1,j-1,s[i - 1], t[j - 1])
            DTW[i, j] = cost + min(DTW[i - 1, j],    # insertion
                                   DTW[i, j - 1],    # deletion
                                   DTW[i - 1, j - 1]) # match

    print(DTW)
    return DTW[n, m]

# Example usage
s = [1, 4, 1, 1, 1]
t = [1, 1, 1, 4, 1]
print(DTWDistance(s, t))



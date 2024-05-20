def FindPeak(arr, n):
    for i in range(1, n-1):
        if(arr[i]>=arr[i-1] and arr[i]>=arr[i+1]):
            return i

arr = [ 1, 3, 20, 4, 1, 0 ]
n = len(arr)
print("Index of a peak point is", FindPeak(arr, n))
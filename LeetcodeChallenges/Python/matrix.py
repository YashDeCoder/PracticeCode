def matrix(A, B):
    n = len(A)
    for j in 1:n
        for i in 1:m
            Cij = z
            for k in 1:l
                @inbounds Cij += A[i,k]*B[k,j]
            end
            C[i,j] = Cij
        end
    end
    return C
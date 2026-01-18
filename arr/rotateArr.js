/**
 * @param {number[][]} matrix
 * @return {void} Do not return anything, modify matrix in-place instead.
 */
var rotate = function(matrix) {
    let n = matrix.length;
    let newMatrix = Array.from({ length: n }, () => Array(n));
    for(let i = 0; i<n; i++){
        for(let j = 0; j < n; j++){
           newMatrix[[j][n - 1 -i]] = matrix[i][j] 

        }
    }
    
  return  newMatrix;
};
let rotateAns = rotate([[1,2,3],[4,5,6],[7,8,9]])
console.log(rotateAns);
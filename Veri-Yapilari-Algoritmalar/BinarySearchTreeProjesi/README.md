# Binary Search Tree Projesi

## Problem: 
    [7,5,1,8,3,6,0,9,4,2] dizisinin Binary-Search-Tree aşamalarını yazınız.

## Çözüm:
   * [7,5,1,8,3,6,0,9,4,2] dizinin ilk hali.
   * [0,1,2,3,4,5,6,7,8,9] diziyi sıralı kabul ediyoruz.
   *                 [4]                         
   *        [2]                  [7]             
   *     [1]   [3]          [5]       [9]
   *  [0]                [6]       [8]
   

    - İlk olarak root 4 aldık, 2 solunda, 7 sağında kaldı.
    - Sonra 1, root 2'nin solunda ve 3 root 2'nin sağında kaldı. Aynı satırda 5, root 7'nin solunda ve 9 ise root 7'nin sağında kaldı.
    - En son 0, root 1'in solunda, 6 root 5'in solunda ve 8 root 9'un solunda kaldı.

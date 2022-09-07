# MergeSortProjesi

## Veri
    [16,21,11,8,12,22] -> Merge Sort
***
## Problem:
    Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.
## Çözüm:
    [16,21,11] [8,12,22] -> İki parçaya ayrılır.
    [16] [21, 11]   [8,12] [22] -> Bunlarda kendi aralarında iki parçaya ayrılır.
    [16]    [21] [11]       [8] [12]    [22] -> Burada hepsi parçalandı ve karşılaştırma başlar.
    [16] [11,21]    [8,12] [22] -> Burada en küçükler başa yazılır ve birleştirilir.
    [11,16,21] [8,12,22] -> Küçükler başta olmak üzere birleştirme devam eder.
    [8,11,12,16,21,22] -> En sonunda küçükten büyüğe sıralanmış olur.
 ***
## Problem:
    Big-O gösterimini yazınız.
## Çözüm:
    O(nlogn)

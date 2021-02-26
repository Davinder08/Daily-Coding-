let arr = [10, 80, 30, 90, 40, 50, 70, 1, 4, 356, 523, 4, 5, 23, 23, 6];
let loop = 0;

function swap(s, d) {
  const t = arr[s];
  arr[s] = arr[d];
  arr[d] = t;
}

function bubbleSort(start, end) {
  while (start < end) {
    for (let i = start + 1; i <= end; i++) {
      loop++;
      if (arr[i] < arr[start]) {
        swap(start, i);
      }
    }
    start++;
  }
}




// Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.

// Worst complexity: n^2
// Average complexity: n^2
// Best complexity: n
// Space complexity: 1

console.log("before", "loop :" + loop, arr);
bubbleSort(0, arr.length - 1);
console.log("after", "loop :" + loop, arr);


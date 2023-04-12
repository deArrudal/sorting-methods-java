# Sorting Methods in Java

A set of sorting methods implemented in Java. 

## Description

This repository contains the following sorting algorithms:
* Bubble Sort
    * A sinking algorithm that repeatedly compares an element with the one before it, swapping their values if needed.
    * BubbleSort.java
* Quick Sort
    * A divide-and-conquer algorithm that partitions the array into two sub-arrays, based on a pivot element.
    * QuickSort.java
* Merge Sort
    * A divide-and-conquer algorithm that first divides the array into a single element sub-arrays and then repeatedly merge those into new sorted subsets.
    * MergeSort.java
* Insertion Sort
    * A sorting algorithm that compares one item at time to build the sorted array.
    * InsertionSort.java

## Getting Started

### Dependencies

* Java Development Kit (JDK).

### Folder Structure
````
JAVA - SORT METHODS
├── src
│   ├── App.java
│   ├── BubbleSort.java
│   ├── InsertionSort.java
│   ├── MergeSort.java
│   ├── QuickSort.java
├── bin
├── lib
├── .gitignore
├── LICENSE
└── README.md
````

### Executing program

* On your command prompt, change your current directory to the "src/" folder and type:
```
>> javac App.java
>> java App
```

## Authors

 - deArruda, Lucas [@SardinhaArruda](https://twitter.com/SardinhaArruda)

## Version History

* 0.2
    * Added Quick Sort
    * Added Merge Sort
* 0.1
    * Initial Release

## License

This project is licensed under the GPL-3.0 License - see the LICENSE.md file for details

## Acknowledgments

This README.md was based the amazing [README-Template](https://gist.github.com/DomPizzie/7a5ff55ffa9081f2de27c315f5018afc).

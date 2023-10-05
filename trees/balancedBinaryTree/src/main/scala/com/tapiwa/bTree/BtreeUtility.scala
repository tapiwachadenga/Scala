package com.tapiwa.bTree

object BtreeUtility extends App
{
    val aList: List[Int] = List(71,163,254,366,481,592)
    val aBtree: BTree[Int] = Branch(7, Leaf, Leaf) 

    printf("\nList: \n%s\n", aList)
    printf("\nBTree:\n%s\n", (new BtreeFunction).init(aList, aBtree) )
}

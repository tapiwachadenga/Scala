package com.tapiwa.bTree

object BtreeUtility extends App
{
    val aList: List[Int] = List(1,3,4,6,8,9)
    val aBtree: BTree[Int] = Branch(0, Leaf(), Leaf()) 

    printf("\nList: \n%s\n", aList)
    printf("\nBTree:\n%s\n", (new BtreeFunction).init(aList, aBtree) )
}

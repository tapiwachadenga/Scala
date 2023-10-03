package com.tapiwa.bTree

object BtreeUtility extends App
{
    val aList: List[Int] = List(1,3,4,6,8,9)
    val aBtree: BTree[Int] = null

    println( (new BtreeFunction).init(aList, aBtree) )
}

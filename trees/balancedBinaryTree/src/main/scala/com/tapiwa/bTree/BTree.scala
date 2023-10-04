package com.tapiwa.bTree

sealed trait BTree[+T]  
case object Leaf extends BTree[Nothing]
case class Branch[+T](value: T, left: BTree[T] = Leaf, right: BTree[T] = Leaf) extends BTree[T]


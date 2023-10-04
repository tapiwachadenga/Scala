package com.tapiwa.bTree

trait BTree[T]  
case object Leaf extends BTree[Nothing]
case class Branch[T](value: T, left: BTree[T], right: BTree[T]) extends BTree[T]


package com.tapiwa.bTree

trait BTree[T]  
case class Leaf[T]() extends BTree[T]
case class Branch[T](value: T, left: BTree[T], right: BTree[T]) extends BTree[T]


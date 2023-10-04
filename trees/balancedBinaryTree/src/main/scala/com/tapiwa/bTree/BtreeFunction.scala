package com.tapiwa.bTree

class BtreeFunction
{
    def init[T: Ordering](list: List[T], btree: BTree[T]): BTree[T] =
    {
        import Ordering.Implicits._

        var last = list.length
        // var value: T = _
        // var btree: BTree[T] = Branch(value, Leaf, Leaf)
      
        def create(list: List[T], btree: BTree[T], start: Int, last: Int): BTree[T] = 
        {
            var mid = (start + last) / 2
            println(mid)
            list match 
            {
              case Nil => Leaf
              case v::vs => 
              {
                  if (v == list(mid)) Branch(v, Leaf, Leaf)
                  else if (v > list(mid)) Branch(v, btree, create(vs, btree, (mid + 1), last))
                  else Branch(v, create(vs, btree, start, (mid - 1)), btree)
              }
            }
        }
        create(list, btree, 0, last)
        // for (x<-3 to 10) yield {s"$x "}
    }
}

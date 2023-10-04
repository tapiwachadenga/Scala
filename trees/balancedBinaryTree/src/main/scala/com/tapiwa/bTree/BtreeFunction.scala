package com.tapiwa.bTree

class BtreeFunction[T]
{
    def init[T](list: List[T], btree: BTree[T]): Unit =
    {
        var last = list.length
      
        def create[T <% Ordered[T]](list: List[T], btree: BTree[T], start: Int, last: Int): BTree[T] = 
        {
            var mid = (start + last) / 2

            list match 
            {
              case Nil => Leaf()
              case v::vs => 
              {
                              if (v == list(mid)) Branch(v, Leaf(), Leaf())
                              else if (v < list(mid)) Branch(v, create(vs, btree, start, (mid - 1)), btree)
                              else Branch(v, btree, create(vs, btree, (mid + 1), last))
              }
            }
        }
        // create(list, btree, 0, last)
        for (x<-3 to 10) yield {s"$x "}
    }
}

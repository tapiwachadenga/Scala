package com.tapiwa.bTree

class BtreeFunction
{
    def init(list: List[Int], btree: BTree[Int]): BTree[Int] =
    {
        var last = list.length
      
        def create(list: List[Int], btree: BTree[Int], start: Int, last: Int): BTree[Int] = 
        {
            var mid = (start + last) / 2
            // println(mid)
            list match 
            {
              case Nil => Leaf()
              case v::vs => 
              {
                              if (v == list(mid)) {println(v);Branch(v, Leaf(), Leaf())}
                              else if (v < list(mid))  {println(v);Branch(v, create(vs, btree, start, (mid - 1)), btree)}
                              else  {println(v);Branch(v, btree, create(vs, btree, (mid + 1), last))}
              }
            }
        }
        create(list, btree, 0, last)
        // for (x<-3 to 10) yield {s"$x "}
    }
}

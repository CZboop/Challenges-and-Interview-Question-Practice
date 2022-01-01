def first list, n=nil
    if n == nil 
      return list[0]
    else 
      return list[0..n-1]
    end
  end
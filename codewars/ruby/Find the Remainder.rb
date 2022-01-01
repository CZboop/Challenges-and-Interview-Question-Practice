def remainder(a, b)
    if a == 0 or b == 0
      return nil
    elsif a > b
      return a.abs() % b.abs()
    else 
      return b.abs() % a.abs()
    end
  end
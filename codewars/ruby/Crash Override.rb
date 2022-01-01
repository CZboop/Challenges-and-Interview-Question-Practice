def alias_gen(name1, name2)
    if FIRST_NAME.key?(name1.upcase()[0]) == false
      return "Your name must start with a letter from A - Z."
    elsif FIRST_NAME.key?(name2.upcase()[0]) == false
      return "Your name must start with a letter from A - Z."
    end
    x = FIRST_NAME.fetch(name1.upcase()[0])
    y = SURNAME.fetch(name2.upcase()[0])
    return "#{x} #{y}"
    
  end
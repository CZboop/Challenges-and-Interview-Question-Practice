def uefa_euro_2016(teams, scores)
    if scores[0] == scores[1]
      return "At match #{teams[0]} - #{teams[1]}, teams played draw."
    elsif scores[0] > scores[1]
      x = teams[0]
    elsif scores[0] < scores[1]
      x = teams[1]
    end
    return "At match #{teams[0]} - #{teams[1]}, #{x} won!"
  end
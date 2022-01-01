def match(candidate, job):
    wiggle = candidate.get('min_salary')*0.9
    return candidate.get('min_salary')<= job.get('max_salary') or wiggle <=job.get('max_salary') 
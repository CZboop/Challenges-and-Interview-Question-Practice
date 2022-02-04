class FileNameExtractor {
    static extractFileName (dirtyFileName) {
      let noDate = []
      let underSplit = dirtyFileName.split("_")
      for (let i=1; i <underSplit.length ; i++){
        noDate.push(underSplit[i])
      }
      noDate = noDate.join("_")
      return noDate.split(".")[0] + "." + noDate.split(".")[1]
    }
}
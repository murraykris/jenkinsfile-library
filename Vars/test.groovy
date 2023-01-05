void call(Map arguments = [:]) {
    sh 'touch dockerfile'
    Properties p = readProperties(file : 'dockerfile')
}

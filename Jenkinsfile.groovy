node{
    stage("Pull repo"){
        git "git@github.com:mcalik77/packerdev.git"
    }
}
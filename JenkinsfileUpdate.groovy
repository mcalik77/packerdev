node{
    stage("Pull repo"){
        git "git@github.com:mcalik77/packerdev.git"
    }
    stage ("Build AMI"){
        sh " packer build updated/updated.json"
    }
}
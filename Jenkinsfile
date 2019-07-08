node('master') {

stage 'checkout'{
checkout([$class: 'SubversionSCM', additionalCredentials: [],
	excludedCommitMessages: '', excludedRegions: '', excludedRevprop: '',
	excludedUsers: '', filterChangelog: false, ignoreDirPropChanges: false,
	includedRegions: '', locations: [[cancelProcessOnExternalsFail: true,
	credentialsId: 'f7b494d3-938d-428e-81ae-74f0efb129a5', depthOption:
	'infinity', ignoreExternalsOption: true, local: '.', remote:
	'https://github.com/divyasai22/DockerSpringBoot.git']], quietOperation:
	true, workspaceUpdater: [$class: 'UpdateUpdater']])
}

   

}
ENV['VAGRANT_DEFAULT_PROVIDER'] = 'docker'

Vagrant.configure("2") do |config|

  config.ssh.username   = 'root'
  config.ssh.password   = 'root'

  config.hostmanager.enabled           = true
  config.hostmanager.manage_guest      = true

  config.vm.provider "docker" do |d|
    d.build_dir       = "."
    d.has_ssh         = true
    d.remains_running = true
  end

  config.vm.hostname = "ansible"

  config.vm.network "forwarded_port", guest: 8080, host: 7000, host_ip: "127.0.0.1", auto_correct: true

  config.vm.provision :hostmanager

  config.vm.provision :ansible do |ansible|
    ansible.playbook      = "ansible/run.yml"
    ansible.sudo          = true
  end

end

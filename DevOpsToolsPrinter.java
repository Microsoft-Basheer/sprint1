public class DevOpsToolsPrinter {
    public static void main(String[] args) {
        String[] tools = {
            "Git",
            "Jenkins",
            "Docker",
            "Kubernetes",
            "Ansible",
            "Terraform",
            "Prometheus",
            "Grafana",
            "Nagios",
            "ELK Stack (Elasticsearch, Logstash, Kibana)",
            "CircleCI",
            "Travis CI",
            "Puppet",
            "Chef"
        };

        System.out.println("Common DevOps tools:");
        for (String tool : tools) {
            System.out.println("- " + tool);
        }
    }
}

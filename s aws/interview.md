## 1:what is aws and how is it difference from traditional hosting
aws(amazon web services) is a cloud computing platform, that provides services like:
- like computing power
- storage
- databases 
- machine learning
- analyses etc
aws alow users to scales resources up or down based on demand and pay over what they use
## 2:Explain the key components of AWS architecture
AWS architecture includes 
- region : these a are geographically separated areas 
- availability zones(AZs) : these are isolated locations within a region
- virtual private cloud (VPC) : this enables you to launch resources in a virtual network
- EC2 instances,
- S3 storage
- RDS,
- lambda
etc
## 3:what is elastics load balancing(ELB)
This auto distribute incoming application traffic across multiple server to prevent overload

## 4:difference between EC2 and Lambda
### EC2
 - it provide scalable virtual servers
 - it required manual scaling
### Lambda
- this is a serverless : Serverless computing is like renting a fully managed service instead of buying and maintaining your own server.
- it auto scales based on the number of request

## 5: what is n s3 bucket (simple storage service)
it is object storage in aws. it provide durability, scalability and can be configure for versioning and access control 

## 6:how do you secure data at rest in S3
data at rest in S3 can be secured using server-side encryption (SSE)<br>
aws offer diffrence SSe options, including SSE-S3, ssE-KMS, ans SSE-C, each prode avrious levels of controle and security

## 7:what is a security group in aws
security group act as a firewall to control inbound and outbound traffic based on rules

## 8:auto scaling
Auto scaling automatically adjusts the number of instances in  a gouge to maintain performance

## 9:Aws cloudFormation 
is an infrastructure as code (Iac) service that allow describes what resources you need, and CloudFormation takes care of setting everything up for you.

## 10:how does aws lambdas works
lambdas works is a serverless computing service and run code in response to event and auto manages the computing resources. devs upload thier code, and lambda executes it in response to triggers like changes to data in s3 Bucket or updates to Dynamodb table

## 12:explain the use case of Amazon RDs
Amazon RDS(relational Database service) is used for managing relation databases in cloud. it support various database engine like Mysql, PostgreSql, and SQl Server. it handle database routing like backups, scaling patch management

## 13:what is the significances of VPC
VPC (virtual private cloud ) allows you to launch aws resources in to a virtual network. it provide control over the virtual networking environment, including IP address ranges, subnets, routing tables

## 14:How to we handle security in aws 
security is done by implementing IAM (IDENTITY and ACCESS Group Management), using security group, configuring network ACLs, encrypting data in transit and at rest, and regularly auditing and monitoring resource.

## 15:explain the use of aws Lambda Layers
it is the way to centrally mange code and data that is shared across multiple Lambda function
## 16:
## 17:
## 18:
## 19:

## 20:
## 21:
## 22:
## 23:
## 24:
## 25:
## 26:
## 27:
## 28:
## 29:

## 30:
## 31:
## 32:
## 33:
## 34:
## 35:
## 36:
## 37:
## 38:
## 39:
## 30:

## 40:
## 41:
## 42:
## 43:
## 44:
## 45:
## 46:
## 47:
## 48:
## 49:
## 40:

# ----------------------------------PROJECT2 3 Tier Architecture---------------------------------------
- Create S3 Bucket 
- create IAM EC2 instance
- download code from it hub

## VPC
It's a virtual network that you create and control, similar to having your own private space on the internet. With a VPC, you can launch and run your AWS resources, such as servers and databases, in a secure and isolated environment.

## The region Notion in aws
When you create a VPC, you must select the AWS region where you want it to reside. This choice determines the physical location of the network infrastructure supporting your VPC and its associated resources, such as EC2 instances, databases, and load balancers. Each region is designed to provide low latency and high availability for services within that region.

## AZ1 === Availability Zone 1
Availability Zones  is a separate, isolated data center facility within a specific region.<br>
When you deploy resources like servers or databases in AWS, you can choose to place them in a specific AZ. By spreading your resources across multiple AZs, you can increase the availability and fault tolerance of your applications. If there's an issue in one AZ, your applications can continue running in other AZs without being affected.

## EC2 instances
EC2 instances in AWS are like virtual computers that you can rent from Amazon's cloud. You can choose the size and type of these virtual computers based on your needs, such as how much memory or processing power you require. EC2 instances allow you to run your applications and software in the cloud without having to worry about maintaining physical servers. 

## why do we create subnet
- Subnets allow you to divide your VPC into smaller, logically isolated sections. This segmentation helps in organizing your resources and implementing different security policies based on the requirements of each subnet.
-  Subnets provide a way to manage IP addresses efficiently within your VPC. Each subnet is associated with a specific range of IP addresses, and you can allocate these addresses to instances and other resources as needed.
-  By creating subnets in different Availability Zones (AZs), you can achieve high availability and fault tolerance for your applications. If one AZ experiences an outage, resources in other AZs can continue to operate without disruption.

## subnet
A subnet, short for "subnetwork,". subnets are used to divide a single network into smaller, more manageable parts. Each subnet has its own range of IP addresses and typically represents a segment of the larger network.<br>
Subnets are essential for organizing and managing IP addresses within a network. They help improve network efficiency, security, and performance by allowing administrators to group devices logically based on their function, location, or other criteria.


## Amazon Aurora primary DB

## Amazon Read Replica

## Elastic load Balancing (ELB)
it manages your tariffs by distributing the request equitable cross multiple servers. This not only ensures that your website stays up and running smoothly, even if one server goes down, but it also helps handle sudden spikes in traffic without crashing your site. 

## Internet gateway
It is a doorway or channel that allows your resources within a  (VPC) to access the internet and vice versa.
### create an Internet gateway
- create an internet gateway and attache to your VPC


## NAT Gateways
It allows resources within a private subnet to access the internet while keeping their private IP addresses hidden from the outside world.
### create an Nat gateway
- create nat gateway in one available zone
    - NAT-GW-AZ1 (Nat gateway name)
        - select subnet Public-Web-Subnet-AZ-1 
        - allocate elastic IP
    - NAT-GW-AZ2 (Nat gateway name)
        - select subnet Public-Web-Subnet-AZ-2 
        - allocate elastic IP


## Rout Table
Rout table is a set of instructions that tells network traffic where to go based on its destination.<br>
in the rout table you need to edit by putting 0.0.0.0/0 in the destination filed. this say every one in the world can access the Target internal gateway. and finally attache the rout to the subnet basely the public subnet.
- create rout table 
- give a name and select the vpc
    - add  rout where destination === 0.0.0.0/0 and target === Internet gateway and attache to the 2 public subnet (public-web-subnet-AZ1 and public-web-subnet-AZ2)
    - add rout 
- create 2 more rout, one for  each subnet in each availability zone. this will help the private instance access outside the vpc to the nat getaway
- give a name and select the vpc
    - add rout  destination === 0.0.0.0/0 and target === Nat gateway for AZ1 ans attache the private subnet AZ1
    - add rout  destination === 0.0.0.0/0 and target === Nat gateway for AZ2 ans attache the private subnet AZ2

## security groups
- create a security group that allow internet to access the load balancer
    - inbound rule 1
        - type : HTTP
        - Protocol : TCP
        - port rang : 80
    - inbound rule 2
        - source type : anywhere-IPb6 and leave the other as default 
- create a security group that allow web tier to access the load balancer
- create a security group that allow me to access the 
- create a security group that for private server
- create a security group that security to have access to mysql /aurora 


## database deployment

## create an instance of EC2 for App
- give the instance name
- select the image
- in vpc network
    - select your vpc
    - select the subnet where the instance we reside (if you select private AZ1 then your security group must match)
    - select the security group that marches (that is private security group)
- connect to the instance and  ping (address can accept a request)
- in the instance install mysql
- configure your data base
- test the data base
- install all necessary tools to run my node manager running all over time 

- THIS is done after S3 bucket
    - import your server app 
    - run your app 


## S3 bucket
- use to upload you source code
- in your source code you have DBConfig.ts and the same config that is found in your mysql aws to this config file

- upload the apptier folder


# create a machine image from ## create an instance of EC2
- to setup load balancer
- auto scaling group
    - this have 2 server running and this will be register as by the load balancer


## create an instance of EC2 for Web (nginx)
- in my nginx config i should replace the internal proxi wil the ip for the load balancer 